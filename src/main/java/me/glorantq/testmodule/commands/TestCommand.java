package me.glorantq.testmodule.commands;

import me.glorantq.modbot.commands.api.Command;
import me.glorantq.modbot.commands.api.CommandImplementation;
import me.glorantq.modbot.commands.api.ICommand;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

@Command(commandName = "test", aliases = "testing", description = "A demonstration command")
public class TestCommand implements ICommand {

    @CommandImplementation
    public void testCommand(MessageReceivedEvent event) {
        event.getChannel().sendMessage("Hi there!");
    }

    @Command(commandName = "sub", description = "A demonstration sub-command")
    public static class SubCommand implements ICommand {

        @CommandImplementation
        public void testSubCommand(MessageReceivedEvent event) {
            event.getChannel().sendMessage("Guten tag!");
        }
    }
}
