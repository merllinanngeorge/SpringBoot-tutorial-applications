package com.telusko;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.bo.JobSeeker;
import com.telusko.service.JobSeekerService;


@SpringBootApplication
public class JobSeekerApplication {

	public static void main(String[] args) throws IOException 
	{
		ConfigurableApplicationContext context = SpringApplication.run(JobSeekerApplication.class, args);
		
		
		JobSeekerService service = context.getBean(JobSeekerService.class);
		
//		InputStream input=null;
//		FileReader reader=null;
//		byte image[]=null;
//		char textFile[]=null;
//		
//		try 
//		{
//			input=new FileInputStream("/Users/merllinanngeorge/Desktop/Spring Boot/LOB/images.jpeg");
//			image=new byte[input.available()];
//			input.read(image);
//			
//			File file=new File("/Users/merllinanngeorge/Desktop/Spring Boot/LOB/Name.txt");
//			reader=new FileReader(file);
//			textFile=new char[(int) file.length()];
//			reader.read(textFile);
//			 
//		} 
//		catch (FileNotFoundException e) 
//		{
//		
//			e.printStackTrace();
//		}
//		catch (Exception e) 
//		{
//		
//			e.printStackTrace();
//		}
//		
//		JobSeeker job=new JobSeeker("Aditi" , "Bengaluru", image, textFile);
//		String status=service.registerJobSeeker(job);
//		System.out.println(status);
//		
//		try 
//		{
//			reader.close();
//			input.close();
//		} 
//		catch (IOException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Optional<JobSeeker> optional = service.getDetailsById(1);
		if(optional.isPresent())
		{
			 JobSeeker seeker = optional.get();
			 System.out.println("id : "+seeker.getId());
			 System.out.println("Name : "+seeker.getName());
			 System.out.println("City : "+seeker.getCity());
			 
			 //it will be saved in the same project somewhere
			 OutputStream output = new FileOutputStream("image.jpg");
			 output.write(seeker.getImage());
			 output.flush();
			 
			 FileWriter writer = new FileWriter("bio.txt");
			 writer.write(seeker.getTextFile());
			 writer.flush();
		}
		else
		{
			System.out.println("Record not found with the given id");
		}
	
		context.close();
	}

}
