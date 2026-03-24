
import java.util.HashMap;
import java.util.Map;

public class Playlist {
    // Playlist--playlistName (String), Map<String, Track> tracks

    String playlistname;
    Map<String ,Track> tracks;

    public Playlist(String playlistname,Map<String,Track> tracks) {
        this.playlistname=playlistname;
        this.tracks=new HashMap<>();
    }

  public Map<String,Track> getTrack(){
    return tracks;
  }
  public void addTrack(Track track){
    tracks.put(track.getrackId(), track);
  }

  public String getPlayListName(){
    return playlistname;      
  }

  
}
