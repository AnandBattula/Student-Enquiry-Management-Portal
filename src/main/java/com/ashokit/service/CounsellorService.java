package com.ashokit.service;

import com.ashokit.binding.DashboardResponse;
import com.ashokit.entity.Counsellor;

public interface CounsellorService {

	public String saveCounsellor(Counsellor c);
	
	public Counsellor loginCheck(String email, String pwd);
	
	public boolean recoverPwd(String email);
	
	public DashboardResponse getDashboardInfo(Integer cid);
}
