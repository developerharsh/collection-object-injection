package mypack;

import java.util.Date;
import java.util.List;

public class DemoBean implements Demo 
{
	private List courseDetails;

		public void setCourseDetails(List courseDetails) {
		this.courseDetails = courseDetails;
	}

		public void showData()
	{
		System.out.println(courseDetails);
	}
}
