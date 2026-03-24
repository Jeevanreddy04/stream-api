import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Track t1=new Track("t1", "RUN", "skald", "vikings", 300, 4);
        Track t2=new Track("t2", "Perfect", "Ed Sheeran", "private", 320, 5);
        Track t3=new Track("t3", "Shape of u", "Ed Sheeran", "private", 340, 5);
        Track t4 = new Track("t4", "Blinding Lights", "The Weeknd", "pop", 200, 5);
        Track t5 = new Track("t5", "Believer", "Imagine Dragons", "rock", 240, 4);
        Track t6 = new Track("t6", "Thunderstruck", "AC/DC", "rock", 290, 5);
        Track t7 = new Track("t7", "Faded", "Alan Walker", "electronic", 210, 4);
        Playlist p1=new Playlist("My-paly", null);
        Playlist p2=new Playlist("Travel", null);
      p1.addTrack(t1);
      p1.addTrack(t2);
      p1.addTrack(t3);
      p2.addTrack(t4);
      p2.addTrack(t5);
      p2.addTrack(t6);
      p2.addTrack(t7);

      List<Playlist> Library=Arrays.asList(p1,p2);
        //1.List of Artists

        // List<String> artists=Library.stream().flatMap(p->p.getTrack().values().stream()).map(t->t.getArtist()+" - "+t.getTitle()).toList();

        // System.out.println(artists);

        // //2. From all tracks, map to durations in minutes as double.
        // List<Double> durationInMinutes=Library.stream().flatMap(p->p.getTrack().values().stream()).map(t->Math.round((t.getDurationInSeconds()/60.0)*100.00)/100.0).collect(Collectors.toList());
        // System.out.println(durationInMinutes);

        // //3. Get a single List<Track> containing all tracks from all playlists (no nested lists).
        // List<Track> tracks=Library.stream().flatMap(p->p.getTrack().values().stream()).toList();
        // System.out.println(tracks);

        // //4. From all playlists, get a List<String> of all unique artist names.
        // List<String> uniqartistnames=Library.stream().flatMap(p->p.getTrack().values().stream()).map(t->t.getArtist()).distinct().toList();
        // System.out.println(uniqartistnames);

        //4. From all playlists, get a List<String> of all playlist names repeated once per track (for teaching flatMap vs map).
        List<String> playlistnames=Library.stream().flatMap(p->p.getTrack().values().stream().map(t->p.getPlayListName())).toList();
        System.out.println(playlistnames);
        // //6. Get distinct artist names from the library.
        // List<String> artistnamesfromlibrary=Library.stream().flatMap(p->p.getTrack().values().stream()).map(t->t.getArtist()).distinct().toList();
        // System.out.println(artistnamesfromlibrary);

        //8. After flatMapping tracks from all playlists, get distinct tracks by title (assume equals/hashCode by id).
        // List<String> distinctTracks = Library.stream()
        // .flatMap(p -> p.getTrack().values().stream()).map(t->t.getTitle())
        // .distinct()
        // .toList();
        // System.out.println(distinctTracks);

        // //9. Get tracks sorted by title (ascending).
        // List<Track> sortedTracks=Library.stream().flatMap(p->p.getTrack().values().stream()).sorted(Comparator.comparing(Track::getTitle)).toList();
        // System.out.println(sortedTracks);

        // //10. Get tracks sorted by duration descending.
        // List<Track> sortedByDurationInDesc=Library.stream().flatMap(p->p.getTrack().values().stream()).sorted(Comparator.comparing(Track::getDurationInSeconds).reversed()).toList();
        // System.out.println(sortedByDurationInDesc);

        // //11. Get tracks sorted by rating desc then title asc.
        // List<Track> sortedByRatingDesc=Library.stream().flatMap(p->p.getTrack().values().stream()).sorted(Comparator.comparing(Track::getRating).reversed().thenComparing(Track::getTitle)).toList();
        // System.out.println(sortedByRatingDesc);


        // //12. Get the first 10 tracks sorted by rating desc.
        // List<Track>first10tracks=Library.stream().flatMap(p->p.getTrack().values().stream()).sorted(Comparator.comparing(Track::getRating).reversed()).limit(10).toList();
        // System.out.println(first10tracks);

        // //13. After sorting by duration desc, skip the first 5 longest tracks and collect the rest.
        // List<Track> skipFirst5Tracks=Library.stream().flatMap(p->p.getTrack().values().stream()).sorted(Comparator.comparing(Track::getDurationInSeconds).reversed()).skip(5).toList();
        // System.out.println(skipFirst5Tracks);

        //14. Get any 3 explicit tracks from the library.
        // List<Track> explicittracks=Library.stream().flatMap(p->p.getTrack().values().stream()).limit(3).toList();
        // System.out.println(explicittracks);

        // //15. While filtering tracks with rating >= 4, log their titles using peek before collecting.
        // List<Track> filteredTracks=Library.stream().flatMap(p->p.getTrack().values().stream()).filter(t->t.getRating()>=4).peek(t->System.out.println(t.getTitle())).toList();
        // System.out.println(filteredTracks);

        // //16. Create a Map<String, List<Track>> grouping tracks by artist.
        // Map<String,List<Track>> TracksByArtist=Library.stream().flatMap(p->p.getTrack().values().stream()).collect(Collectors.groupingBy(Track::getArtist));
        // System.out.println(TracksByArtist);
        

    }
}
