package dao;

import db.DBConnection;
import model.BugReport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BugDAO {

    public void addBug(BugReport bug) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO BugReport VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bug.getBugNo());
            stmt.setInt(2, bug.getBugCode());
            stmt.setInt(3, bug.getProjectID());
            stmt.setInt(4, bug.getTesterCode());
            stmt.setInt(5, bug.getEmployeeCode());
            stmt.setString(6, bug.getStatus());
            stmt.setString(7, bug.getBugDescription());
            stmt.executeUpdate();
            System.out.println("✅ Bug reported successfully.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<BugReport> getAllBugs() {
        List<BugReport> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM BugReport";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                BugReport bug = new BugReport();
                bug.setBugNo(rs.getInt("bugNo"));
                bug.setBugCode(rs.getInt("bugCode"));
                bug.setProjectID(rs.getInt("projectID"));
                bug.setTesterCode(rs.getInt("TCode"));
                bug.setEmployeeCode(rs.getInt("ECode"));
                bug.setStatus(rs.getString("status"));
                bug.setBugDescription(rs.getString("bugDes"));
                list.add(bug);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public void updateBugStatus(int bugNo, String newStatus) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "UPDATE BugReport SET status=? WHERE bugNo=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, newStatus);
            stmt.setInt(2, bugNo);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Bug status updated successfully.");
            } else {
                System.out.println("❌ Bug not found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteBug(int bugNo) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "DELETE FROM BugReport WHERE bugNo=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bugNo);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Bug deleted successfully.");
            } else {
                System.out.println("❌ Bug not found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
