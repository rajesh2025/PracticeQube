package coroutines.Flow

import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
class ColdFlow {



    @Test
    fun when_collected_flow_multiple_time_then_return_same_values() = runBlocking {

        val coldStream = flow {
            for (i in 1..5) {
//                kotlinx.coroutines.delay(1000L)
                emit(i)
            }
        }

        val collect1 = buildString {
            coldStream.collect { append(it).append(", ") }
        }.removeSuffix(", ")

        val collect2 = buildString {
            coldStream.collect { append(it).append(", ")  }
        }.removeSuffix(", ")

        Assert.assertEquals("1, 2, 3, 4, 5", collect1)
        Assert.assertEquals("1, 2, 3, 4, 5", collect2)
    }


    @Test
    fun given_channel_when_pass_data_from_one_coroutine_then_receive_in_another() = runBlocking {
        val channel = Channel<Int>()
        launch {
            for (i in 1..5){
                delay(100L)
                channel.send(i)
            }
            channel.close()
        }

        val result = async {
            buildString {
                channel.consumeEach {
                    append(it).append(", ")
                }
            }.removeSuffix(", ")
        }

        Assert.assertEquals("1, 2, 3, 4, 5", result.await())
    }
}
