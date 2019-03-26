package Events;

import net.dv8tion.jda.api.events.message.GenericMessageEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Censor extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        int x = 0;
        String[] messageSent = event.getMessage().getContentRaw().split(" ");   //prende il messaggio e inserisce le parole in una posizione del vettore

        for (x = 0; x < messageSent.length; x++) {
            messageSent[x] = messageSent[x].replaceAll("[^a-zA-Z0-9_-]", "");

            if (messageSent[x].equalsIgnoreCase("cazzo")) {

                event.getMessage().delete().queue();
                event.getChannel().sendMessage("You got purged, clean your mouth").queue();

            }

        }
    }
}
//da trovare una soluzione