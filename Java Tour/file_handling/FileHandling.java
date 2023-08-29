package file_handling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        // use this link -- https://www.marcobehler.com/guides/java-files


        //How to check if a file exists
        Path path = Path.of("Dummy_files/File1.txt");
        Boolean exist = Files.exists(path);
        System.out.println("the given file are exits- " + exist);


        //How to get the last modified date of a file
        FileTime lastModified = Files.getLastModifiedTime(path);
        System.out.println("the file was last updated on- " + lastModified);

        //How to compare files (Java12+)
        /**
         * This is a relatively new addition to Java, available since Java 12. It compares the sizes and bytes of two files and returns the position of the first (byte) mismatch. Or, -1L if there was no mismatch.
         *
         * Hence, if you are comparing two completely different files, you’ll get this as console output: the very first byte already didn’t match, hence the mismatch is position zero.
         */
//        long mismatchIndex = Files.mismatch(path, Paths.get("./Dummy_files/File1.txt"));
//        System.out.println("mismatch = " + mismatchIndex);


        //How to get the owner of a file
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner of the file- " + owner);
        //Self explanatory. Returns the owner of a file or directory as UserPrincipal (which extends from Principal). On linux it will return the user principal it means current account name


        //How to create temp files
        Path tempFile1 = Files.createTempFile(null, null);
        Path tempFile2 = Files.createTempFile(path.getParent(), null, null);
        Path tempFile = Files.createTempFile("prefix", ".txt");
        System.out.println(tempFile);
        //Note: Temp files, contrary to popular belief, do not delete themselves. You have to make sure to explicitly delete them, when creating them in unit tests or when running in production.


        //How to create files and directories
        Path directories = Files.createDirectories(path.getParent().resolve("./Dummy_files/temp.txt")); // in resolver the path or file you pass it created as it is
        System.out.println("directories- " + directories);

//        Path filePath = Files.createFile(newDirectory.resolve("emptyFile.txt")); // higher version of java


        //How to get the Posix permissions of a file
        Set<PosixFilePermission> permissions = Files.getPosixFilePermissions(path);
        System.out.println("file having permissions- " + permissions);

//-----------------------------------------Writing & Reading Files--------------------------------------------------------------------------------------


        //How to write strings to files
        Path path1 = Files.createTempFile("newFile", ".txt");
        Files.writeString(path1, "hello world");
        System.out.println(path1);



        //How to read strings from files

        String str = Files.readString(path);
        System.out.println(str);
    }
}
