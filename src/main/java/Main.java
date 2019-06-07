import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        String json = "[{\"word\":\"\uFEFFАБА\",\"partOfSpeech\":\"з а т\",\"scope\":\"к ө н е\"},\n" +
                "{\"word\":\"АБАҒАН\",\"partOfSpeech\":\"з а т\",\"scope\":\"к ө н е\"},\n" +
                "{\"word\":\"АБАДАН\",\"partOfSpeech\":\"undefined\"},\n" +
                "{\"word\":\"АБАЙМА\",\"partOfSpeech\":\"з а т\",\"scope\":\"ж е р г\"},\n" +
                "{\"word\":\"АБАЙШЫЛ\",\"partOfSpeech\":\"с ы н\"},\n" +
                "{\"word\":\"АБАЙШЫЛ\",\"partOfSpeech\":\"с ы н\"},\n" +
                "{\"word\":\"АБАҚ\",\"partOfSpeech\":\"з а т\",\"scope\":\"к ө н е\"},\n" +
                "{\"word\":\"АБАТТАНДЫРЫЛ\",\"partOfSpeech\":\"undefined\"},\n" +
                "{\"word\":\"АБАТТАНДЫРЫЛУ\",\"partOfSpeech\":\"undefined\"},\n" +
                "{\"word\":\"АБДАН\",\"partOfSpeech\":\"з а т\",\"scope\":\"к ө н е\"},\n" +
                "{\"word\":\"АБДЫРЫҚ\",\"partOfSpeech\":\"з а т\",\"scope\":\"з о о л\"},\n" +
                "{\"word\":\"АБЛЫҚПА\",\"partOfSpeech\":\"с ы н\"},\n" +
                "{\"word\":\"АБРАТ\",\"partOfSpeech\":\"з а т\",\"scope\":\"ж е р г\"},\n" +
                "{\"word\":\"АБУТИЛЕН\",\"partOfSpeech\":\"з а т\",\"scope\":\"б о т\"},\n" +
                "{\"word\":\"АБЫЗДЫЛЫҚ\",\"partOfSpeech\":\"з а т\"}]";

        Gson gson = new Gson();
        /*
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\orynb\\Desktop\\Орик\\IdeaProjects\\Deserializing\\src\\main\\resources\\kazArticles3.json"));
        List<Article> articles = gson.fromJson(br, new TypeToken<List<Article>>(){}.getType());
        for (Article article : articles) {
            System.out.println(article);
        }*/
        BufferedReader br = new BufferedReader(new FileReader("FFoutput.txt"));
        Type listType = new TypeToken<List<Word>>(){}.getType();

        List<Word> words = gson.fromJson(br, listType);

        FileWriter fileOutputWords = new FileWriter("lemmas.txt");

        fileOutputWords.write("[");
        for (int i = 0; i < words.size(); i++)
        {
            fileOutputWords.write("\"" + words.get(i).getWord() + "\",");
        }
        fileOutputWords.write("]");


    }
}
