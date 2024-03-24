package streams;

import java.util.regex.*;
public class Regex {
    public static void main(String[] args) {
        String[] strings = {
                "!MEM 02/307 MEM OBST POLE (ASN UNKNOWN) 350336N0895810W (1.12NM N MEM) UNKNOWN (80FT AGL) NOT LGTD 2402270158-2405312300",
                "!MEM 03/031 MEM OBST TOWER LGT (ASR 1053137) 345800.00N0900356.00W (6.3NM SW MEM) 525.9FT (215.9FT AGL) U/S 2403050611-2404040001",
                "!FLL 03/087 FLL OBST CRANE (ASN 2023-ASO-27754-OE) 260424N0800712W (1.6NM E FLL) 189FT (182FT AGL) LGTD 2403182018-2412310200EST"
        };
        String patternCord = "[0-9]+.?[0-9]*N[0-9]+.?[0-9]*W";
        Pattern cordCompile = Pattern.compile(patternCord);
        String patternObs = "OBST\\s+(\\w+)";
        Pattern obsCompile = Pattern.compile(patternObs);
        for (String str : strings) {
            Matcher obsMatcher = obsCompile.matcher(str);
            Matcher coordMatcher = cordCompile.matcher(str);
            if (obsMatcher.find()) {
                System.out.println("Obstacle " + obsMatcher.group().replace("OBST",""));
            }
            if (coordMatcher.find()) {
                System.out.println("Coordinates " + coordMatcher.group());
            }
        }

        String regex1 = "OBST [\\w]*";
        String regex2 = "[\\d]+.?[\\d]*N[\\d]+.?[\\d]*W";

        Pattern pattern = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(regex1);

        Pattern pattern2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(regex2);

        while(matcher.find()) {
            boolean moreMatch = matcher2.find();
            String obstacle = matcher.group();
            System.out.print(matcher2.group() + ' ');
            System.out.println(obstacle.substring(obstacle.indexOf(' ') + 1));
        }



    }
}