package syntax.functions.type.extension_func.example7

import java.awt.Graphics2D
import java.nio.file.Paths

fun main(args: Array<String>) {
    // #1
    // Without "apply{}"
    /*val task = Runnable { println("Running") }
    val thread = Thread(task)
    thread.setDaemon(true)
    thread.start()*/

    // #2
    // With "apply{}"
    val task = Runnable { println("Running") }
    Thread(task).apply { setDaemon(true) }.start()

    // With "let{}"
    val outputPath = Paths.get("/user/home").let {
        val path = it.resolve("output")
        path.toFile().createNewFile()
        path
    }

    /*
    val g2 = Graphics2D()

    // #1
    // Without "with{}"
    g2.stroke = BasicStroke(10F)
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
    g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE)
    g2.background = Color.BLACK

    // #2
    // With "with{}"
    with(g2) {
        stroke = BasicStroke(10F)
        setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE)
        background = Color.BLACK
    }
    */
}