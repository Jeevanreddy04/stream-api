public class Track {


    // trackId (String),title (String),artist (String),album (String),durationInSeconds (int),rating (int, 1 to 5)

     String trackId;
     String title;
     String artist;
     String album;
     int durationInSeconds;
     int rating;

    public Track( String trackId, String title, String artist,String album,int durationInSeconds, int rating){
     this.trackId=trackId;
    this.title=title;
   this.artist=artist;
      this.album=album;
 this.durationInSeconds=durationInSeconds;
     this.rating=rating;

    }

    public  String getrackId(){
        return this.trackId;
    }
    
    public  String getArtist(){
        return this.artist ;
    }
    public  String getTitle(){
        return this.title;
    }
    public  String getAlbum(){
        return this.album;
    }
    public  int getDurationInSeconds(){
        return this.durationInSeconds;
    }
    public int getRating(){
        return this.rating;
    }

    @Override
    public String toString(){
        return "["+"Trackid :"+trackId+", Artist :"+artist+", Album :"+album+", Title :"+title+"]";
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Track)) return false;
        Track track=(Track) o;
        return this.trackId.equals(track.trackId);
    }
    @Override
    public int hashCode(){
        return trackId.hashCode();
    }
}