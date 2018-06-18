package me.glorantq.testmodule;

import me.glorantq.modbot.me.glorantq.modbot.IBot;
import me.glorantq.modbot.module.JavaModule;
import me.glorantq.modbot.module.Module;
import me.glorantq.testmodule.commands.TestCommand;

@Module(name = "Test Module", authors = "glorantq", version = "1.0.0", description = "An example module", iconUrl = "https://vignette.wikia.nocookie.net/surrealmemes/images/4/4b/Meme_Man.PNG/revision/latest?cb=20170512214457")
public class TestModule extends JavaModule {

    @Override
    public void onInit(IBot iBot) {
        iBot.getCommandHandler().registerCommand(this, TestCommand.class);

        getLogger().warn("The testing module was successfully loaded!");
    }

    @Override
    public void onEnable() {
        getLogger().warn("The testing module was enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().warn("The testing module was disabled!");
    }
}
