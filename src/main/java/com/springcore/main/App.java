package com.springcore.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Student;
import com.springcore.dao.StudentDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/resources/config.xml");
		StudentDao studentDao = context.getBean("studentDaoImpl", StudentDao.class);

		Student std = new Student(104, "rahul", "mumbai");

		boolean go = true;

		while (go) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to ORM");
			System.out.println("Press 1 for add student");
			System.out.println("Press 2 for get detail for single student");
			System.out.println("Press 3 for display all student");
			System.out.println("Press 4 for update");
			System.out.println("Press 5 for delete");
			System.out.println("Press 0 to exit");

			try {
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					insertUser(scanner, std, studentDao);
					break;
				case 2:
					findUser(scanner, std, studentDao);
					break;
				case 3:
					findAllUser(scanner, std, studentDao);
					break;
				case 4:
					updateUser(scanner, std, studentDao);
					break;
				case 5:
					deleteUser(scanner, std, studentDao);
					break;
				case 0:
					go = false;
					exit(scanner);
					return;
				default:
					System.out.println("Invalid choice. Try again.");
				}
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Invalid input");
				System.out.println(e.getMessage());
			}
		}

	}

	public static void insertUser(Scanner scanner, Student std, StudentDao studentDao) {
		try {
			System.out.println("Enter student ID: ");
			int id = scanner.nextInt();

			System.out.println("Enter student name: ");
			String name = scanner.next();

			System.out.println("Enter student city: ");
			String city = scanner.next();

			std.setStdId(id);
			std.setStdName(name);
			std.setStdCity(city);

			int result = studentDao.insert(std);
			System.out.println("final result of inserted id : " + result);

		} catch (Exception e) {
			System.out.println("Something went to wrong");
			System.out.println(e.getMessage());
		}
	}

	public static void findUser(Scanner scanner, Student std, StudentDao studentDao) {
		try {
			System.out.println("Enter student ID for search : ");
			int id = scanner.nextInt();

			Student result = studentDao.getStudent(id);
			System.out.println(" \n result id is :" + result.getStdId() + "\n name is : " + result.getStdName()
					+ "\n result city :" + result.getStdCity() + "\n \n");
		} catch (Exception e) {
			System.out.println("Something went to wrong");
			System.out.println(e.getMessage());
		}
	}

	public static void findAllUser(Scanner scanner, Student std, StudentDao studentDao) {
		try {
			List<Student> result = studentDao.getAllStudent();

			for (Student student : result) {
				System.out.println(" \n result id is :" + student.getStdId() + "\n name is : " + student.getStdName()
						+ "\n result city :" + student.getStdCity() + "\n \n");
				System.out.println("============================================");
			}
		} catch (Exception e) {
			System.out.println("Something went to wrong");
			System.out.println(e.getMessage());
		}
	}

	public static void updateUser(Scanner scanner, Student std, StudentDao studentDao) {
		try {
			findUser(scanner, std, studentDao);

			System.out.println("Enter student ID: ");
			int id = scanner.nextInt();

			System.out.println("Enter student name: ");
			String name = scanner.next();

			System.out.println("Enter student city: ");
			String city = scanner.next();

			std.setStdId(id);
			std.setStdName(name);
			std.setStdCity(city);

			studentDao.update(std);

			System.out.println(" \n result id is :" + std.getStdId() + "\n name is : " + std.getStdName()
					+ "\n result city :" + std.getStdCity() + "\n \n");
		} catch (Exception e) {
			System.out.println("Something went to wrong");
			System.out.println(e.getMessage());
		}

	}

	public static void deleteUser(Scanner scanner, Student std, StudentDao studentDao) {
		try {
			System.out.println("Enter student ID: ");
			int id = scanner.nextInt();

			studentDao.deleteStudent(id);
			System.out.println("delete student id : " + id);
		} catch (Exception e) {
			System.out.println("Something went to wrong");
			System.out.println(e.getMessage());
		}
	}

	public static void exit(Scanner scanner) throws InterruptedException {
		scanner.close();
		int i = 5;
		while (i != 0) {
			System.out.print(".");
			Thread.sleep(1000);
			i--;
		}
		System.out.println("\n Exiting Goodbye!");
	}
}
