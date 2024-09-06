package com.music;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.music.Music;

public class Action {
    List<Music> musics=new ArrayList<>();

    public void addMusic(Music m){
        musics.add(m);
    }

    public List<Music> getAllSongs() {
        return musics;
    }

    public Music getOneDetail(String string) {
        for(Music one_music:musics){
            if(one_music.getName().equals(string)){
                return one_music;
            }
        }
        return null;
        
    }

    public List<Music> allText(String string) {

        String res=string.toLowerCase();
        List<Music> alltext=musics.stream().filter(m->m.getLanguage().toLowerCase().contains(res)||
                                                        m.getArtist().toLowerCase().contains(res)||
                                                        m.getName().toLowerCase().contains(res)||
                                                        m.getMovie().toLowerCase().contains(res)).collect(Collectors.toList());

        // for(Music text:musics){
        //     String name=text.getName().toLowerCase();
        //     String movie=text.getMovie().toLowerCase();
        //     String lang=text.getLanguage().toLowerCase();
        //     String artist=text.getArtist().toLowerCase();
        //     if(name.contains(res)||movie.contains(res)||lang.contains(res)||artist.contains(res)){
        //         alltext.add(text);
        //     }
        // }
        return alltext;
    }

    public List<Music> getLanguageSongs(String string) {
        String res=string.toLowerCase();
        List<Music> lang=musics.stream().filter(m->m.getLanguage().toLowerCase().contains(res)).collect(Collectors.toList());
        // List<Music> lang=new ArrayList<>();
        // for(Music m:musics){
        //     String name=m.getLanguage().toLowerCase();
        //     if(name.contains(res)){
        //         lang.add(m);
        //     }
        // }
        return lang;
    }

    public List<Music> getSongsOfYear(int i) {
       
    //Use of only musics object to filter data and convert it to list
       List<Music> mu=musics.stream().filter(m->m.getYear()>=i).collect(Collectors.toList());
    //List<Music> allsongs=new ArrayList<>();  
    //    for(Music mu:musics){
    //     if(mu.getYear()>=i){
    //         allsongs.add(mu);
    //     }
    //    }
       return mu;
    }
}
