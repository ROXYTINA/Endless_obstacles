package audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class WavPlayer {

    public static void main(String[] args) {

        // Path to the .wav file
        String filePath = "platform2D\\rsc\\n" + //
                "ewAudio\\Sakura_dead1.wav"; // Adjust the path as needed

        try {
            // Create a File object for the .wav file
            File audioFile = new File(filePath);

            // Create an AudioInputStream from the file
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Get the audio format and data line
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Open and start the clip
            Clip audioClip = (Clip) AudioSystem.getLine(info);

            audioClip.open(audioStream);
            audioClip.start();

            System.out.println("Playback started. Press Enter to stop...");
            System.in.read(); // Wait for the user to press Enter to stop playback

            audioClip.close(); // Close the clip
            audioStream.close(); // Close the stream
        } catch (UnsupportedAudioFileException e) {
            System.out.println("The specified audio file is not supported.");
        } catch (LineUnavailableException e) {
            System.out.println("Audio line for playback is unavailable.");
        } catch (IOException e) {
            System.out.println("Error playing the audio file.");
        }
    }

}
