package de.erdbeerbaerlp.dcintegration.common.discordCommands;

import de.erdbeerbaerlp.dcintegration.common.storage.Configuration;
import de.erdbeerbaerlp.dcintegration.common.storage.Localization;
import de.erdbeerbaerlp.dcintegration.common.util.MessageUtils;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;


public class CommandUptime extends DiscordCommand {
    public CommandUptime() {
        super("uptime",Localization.instance().commands.descriptions.uptime);
    }



    @Override
    public void execute(SlashCommandEvent ev) {
        ev.reply(Localization.instance().commands.cmdUptime_message.replace("%uptime%", MessageUtils.getFullUptime())).queue();
    }
}
