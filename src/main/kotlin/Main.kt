import dev.kord.core.event.message.*
import dev.kord.core.Kord
import dev.kord.core.on
import io.github.cdimascio.dotenv.dotenv


suspend fun main(args: Array<String>) {
    val dotenv = dotenv()
    val botToken = dotenv["BOT_TOKEN"]
    val kord = Kord(botToken)

    kord.on<MessageCreateEvent> {
        println(message)
    }

    kord.login()
}