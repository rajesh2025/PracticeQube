package fundamental

class BackingFieldNProperty {
    val id: Int? =  null
        get(): Int ? {
            if (field != null) {
                return field * 2
            }
            return field
        }

    var name : String = ""
        set(value) : Unit { field = value }
        get() : String  { return field }

}