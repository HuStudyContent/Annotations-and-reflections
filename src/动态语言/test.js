
//本来这里的x是一个字符串，但是在运行以后，x=8,改变了其结构：
function f() {
    var x = "var a = 3;var b = 3;alert(a+b)";
    eval(x)
}