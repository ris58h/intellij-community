// "Create secondary constructor" "false"
// ERROR: Too many arguments for public constructor G() defined in G
// ACTION: Convert to block body
// ACTION: Create function 'G'
// ACTION: Enable option 'Function return types' for 'Types' inlay hints
// ACTION: Introduce local variable
// ACTION: Remove argument

fun test() = G(<caret>1)