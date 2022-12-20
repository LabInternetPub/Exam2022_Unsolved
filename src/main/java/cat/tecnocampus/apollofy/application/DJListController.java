package cat.tecnocampus.apollofy.application;

import cat.tecnocampus.apollofy.persistence.DJListRepository;
import cat.tecnocampus.apollofy.persistence.DJListTrackFragmentRepository;
import cat.tecnocampus.apollofy.persistence.TrackRepository;
import cat.tecnocampus.apollofy.persistence.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DJListController {

    private DJListRepository djListRepository;
    private UserRepository userRepository;
    private TrackRepository trackRepository;
    private DJListTrackFragmentRepository djListTrackFragmentRepository;

    public DJListController(DJListRepository djListRepository, UserRepository userRepository,
                            TrackRepository trackRepository,
                            DJListTrackFragmentRepository djListTrackFragmentRepository) {
        this.djListRepository = djListRepository;
        this.userRepository = userRepository;
        this.trackRepository = trackRepository;
        this.djListTrackFragmentRepository = djListTrackFragmentRepository;
    }

    /* TODO 4.2
        Implement a method (or as many as you need) to add track fragments to existing DJLists. For example:
        public void addTracksToDJlistWithTimeRange(String userEmail, Long DJListId, List<PlaylistTrackDTO> tracksDTO)

        Also you may want to receive a list of objects with the following attributes:
        Long trackId, Long startTimeMillis, Long endTimeMillis.
        You can use "application/dto/DJListTrackDTO for this matter (see _TODO 4.3)

        You'll need to implement a method in the DJListTrackFragmentRepository to get the DJListTrackFragments that point
        to a given DJList and Track (see _TODO 4.5)

        This method has to verify the following constraints and implement the specified behaviour:
        - The playlist with the provided identifier exists.
        - The user with the provided identifier exists.
        - The provided user is the owner of the playlist.
        - For each of the PlaylistTrackDTO in "tracksDTO" parameter:
              -you must verify that the track exists.
              -in the case that the track is already associated to that playlist, then startTimeMillis and endTimeMillis
               are updated in its corresponding PlaylistTrack object.
              -in case the track is not associated to the playlist yet, then you must create a new PlaylistTrack object,
               linking the track to the playlist and specifying startTimeMillis and endTimeMillis accordingly.
       */

}