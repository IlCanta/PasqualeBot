import Events.Censor;
import Events.Wipe;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String[] args) throws Exception {

        JDA jda = new JDABuilder(  "NTU5NjgyODUxMzYxMjU5NTMw.D3pBog.tB7RUF-Dfp1I6iZ0bd_B8pFMZVg" ).build();

        jda.addEventListener(new Wipe());  //classe controllo testuale (wipe)
        jda.addEventListener(new Censor());  //classe per il bot censura
c
    }

}
