import java.io.BufferedReader;

import java.io.File;

import java.io.IOException;

import java.io.InputStreamReader;

class filed {

    public static void analyze(String s)

    {

        File f = new File(s);

        if (f.exists()) {

            System.out.println(f.getName() + "is a file");

            System.out.println(f.canRead() ? "is readable" : "is not readable");

            System.out.println(f.canWrite() ? "is writable" : "is not writeable");

            System.out.println("Filesize:" + f.length() + "bytes");

            System.out.println("File last mpodified:" + f.lastModified());

        }

        else

            System.out.println("file not exists");

        if (f.isDirectory())

        {

            System.out.println(f.getName() + " is directory");

            System.out.println("lists of files");

            String dir[] = f.list();

            for (int i = 0; i < dir.length; i++)

                System.out.println(dir[i]);

        }

    }

}

public class fileExp {

    public static void main(String args[]) throws IOException {

        filed fd = new filed();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the file name:");

        String s = br.readLine();

        fd.analyze(s);

    }

}
