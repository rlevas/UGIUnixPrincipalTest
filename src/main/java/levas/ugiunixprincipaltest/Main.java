package levas.ugiunixprincipaltest;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

public class Main {
  public static void main(String[] args) throws IOException {
    Configuration conf = new Configuration();

    UserGroupInformation.setConfiguration(conf);

    UserGroupInformation user = UserGroupInformation.getCurrentUser();

    if (user != null) {
      System.out.print("Authenticated user: ");
      System.out.println(user.getUserName());
    } else {
      System.out.println("UGI is null");
    }
  }
}
