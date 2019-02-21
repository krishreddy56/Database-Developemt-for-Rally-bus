package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import java.sql.Date;

import com.beans.*;



public class Trip {
	public static int save(TripBean bean) {
		int status=0;
		
		try{
			Connection con=DB.getCon();
			
			PreparedStatement ps=con.prepareStatement("insert into trip values(?,?,?,?,?)");
			ps.setInt(1,bean.getEventid());
			ps.setString(2,bean.getEventCategory());
			ps.setString(3,bean.getDepartDate());
			ps.setString(4,bean.getReturnDate());
			ps.setInt(5,bean.getCharge());
			status=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	public static List<TripBean> view(){
		List<TripBean> list=new ArrayList<TripBean>();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from trip order by eventid desc");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				TripBean bean=new TripBean();
				bean.setEventid(rs.getInt("eventid"));
				bean.setEventCategory(rs.getString("eventcategory"));
				bean.setDepartDate(rs.getString("departdate"));
				bean.setReturnDate(rs.getString("returndate"));
				bean.setCharge(rs.getInt("charge"));
				list.add(bean);
			}
			con.close();
		} catch (Exception e) {
			
			return null;
		}
		
		return list;
	}
	
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from trip where eventid=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

	public static TripBean viewById(int id){
		TripBean bean=new TripBean();
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from trip where eventid=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				bean.setEventid(rs.getInt("eventid"));
				bean.setEventCategory(rs.getString("eventcategory"));
				bean.setDepartDate(rs.getString("departdate"));
				bean.setReturnDate(rs.getString("returndate"));
				bean.setCharge(rs.getInt("charge"));
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return bean;
	}

	public static int update(TripBean bean){
		int status=0;
		try{
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update trip set eventid=?,eventcategory=?,departdate=?,returndate=?,charge=? where eventid=?");
			ps.setInt(1,bean.getEventid());
			ps.setString(2,bean.getEventCategory());
			ps.setString(3,bean.getDepartDate());
			ps.setString(4,bean.getReturnDate());
			ps.setInt(5,bean.getCharge());
			ps.setInt(6,bean.getEventid());
			status=ps.executeUpdate();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}

	public static int save(BusBean bean) {
        int status=0;
		
		try{
			Connection con=DB.getCon();
			
			PreparedStatement ps=con.prepareStatement("insert into bus values(?,?,?,?)");
			ps.setString(1,bean.getBusid());
			ps.setString(2,bean.getCapacity());
			ps.setString(3,bean.getModel());
			ps.setString(4,bean.getMake());
			
			status=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){System.out.println(e);}
		
		return status;
		
	}

	public static List<BusBean> view1() {
		// TODO Auto-generated method stub
		List<BusBean> list=new ArrayList<BusBean>();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from bus");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				BusBean bean=new BusBean();
				bean.setBusid(rs.getString("busid"));
				bean.setCapacity(rs.getString("capacity"));
				bean.setModel(rs.getString("model"));
				bean.setMake(rs.getString("make"));
				
				list.add(bean);
			}
			con.close();
		} catch (Exception e) {
			
			return null;
		}
		
		return list;
	}
	}
	

