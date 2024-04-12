class Else(val exec: Boolean) {
    infix fun Else(block: () -> Unit) = Unit.let { if (exec) block() }
}

fun If(cond: Boolean, block: () -> Unit): Else = Else(!cond).also { if (cond) block() }