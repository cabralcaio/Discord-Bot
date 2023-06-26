# Discord Bot with Kotlin and Kord

This is a simple Discord bot created using the Kotlin programming language and the Kord library. The bot is designed to perform various tasks and interact with users in Discord servers.

## Getting Started

To get started with the bot, follow the instructions below:

### Prerequisites

- Kotlin: [Download and install Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)
- Kord library: Add the Kord dependency to your project. You can find the latest version and installation instructions on the [Kord GitHub page](https://github.com/kordlib/kord)

### Installation

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/cabralcaio/Discord-Bot
   ```

2. Build the project:

   ```shell
   cd Discord-Bot
   ./gradlew build
   ```

3. Configure the bot token:

    - Create a new Discord bot on the [Discord Developer Portal](https://discord.com/developers/applications).
    - Copy the bot token.
    - Create a new file in the root directory of your project and name it `.env`.
    - Open the `.env` file and add the following line:
    ```
       BOT_TOKEN=your-bot-token
    ```
    - Replace the `BOT_TOKEN` value with your bot token.

4. Run the bot:

   Open the Main.kt and run it.

## Usage

Once the bot is running and connected to your Discord server, you can use the following commands:

- `!hello`: The bot will reply with a friendly greeting.
- `!help`: The bot will display a list of available commands.

Feel free to customize the commands and add more functionality to suit your needs.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgements

- [Kord library](https://github.com/kordlib/kord) - The library used for interacting with the Discord API in Kotlin.
- [Discord Developer Portal](https://discord.com/developers/applications) - The portal used to create and manage Discord bots.

## Contact

If you have any questions or suggestions regarding this project, please feel free to contact me at [LinkedIn](https://www.linkedin.com/in/cabralcaio/)

Happy coding!