    package Events;

    import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
    import net.dv8tion.jda.api.hooks.ListenerAdapter;

    public class Wipe extends ListenerAdapter {

        public void onGuildMessageReceived(GuildMessageReceivedEvent event) {        //listener, analizza tutti i messaggi inviati nel server
            int x = 0;
            String[] messageSent = event.getMessage().getContentRaw().split(" ");   //prende il messaggio e inserisce le parole in una posizione del vettore

            for (x = 0 ; x < messageSent.length ; x++){
                messageSent[x] = messageSent[x].replaceAll("[^a-zA-Z0-9_-]" , "");
                if (!event.getMember().getUser().isBot())

                    if(messageSent[x].equalsIgnoreCase("wipe"))
                        {
                    event.getChannel().sendMessage("Wipe your ass!").queue();
                    break;}
            }

            }
        }

//getMessage(), preleva l'evento, mentre getContentRaw estrae il messaggio vero e proprio
//if (messageSent.equalsIgnoreCase("Wipe?"))   //messageSent.equalsIgnoreCase da in output vero o falso, quindi analizza la stringa e vede se combacia con la stringa indicata all'interno delle parentesi
//event.getChannel().sendMessage("Wipe your ass!").queue();  //getChannel() individua il canale in cui è stato inviato il messaggio per inviare la sua risposta
//if (messageSent.equalsIgnoreCase("Descrivi Kilnier"))
//event.getChannel().sendMessage("Kilnier si chiama Emanuele ed è single e pelato!").queue();
//if (messageSent.equalsIgnoreCase("Descrivi Hypa"))
//event.getChannel().sendMessage("Hypa è un povero pagliaccio").queue();

