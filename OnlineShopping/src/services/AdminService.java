package services;

import entities.Admin;
import java.util.*;

public class AdminService {
    private List<Admin> admins = new ArrayList<>();

    public void addAdmin(Admin admin) { admins.add(admin); }
    public List<Admin> getAllAdmins() { return admins; }
	public void createAdmin(int adminId, String username, String email) {
		// TODO Auto-generated method stub
		
	}
	public void viewAdmins() {
		// TODO Auto-generated method stub
		
	}
}