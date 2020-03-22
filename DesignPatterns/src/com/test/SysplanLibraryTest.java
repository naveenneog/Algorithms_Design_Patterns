package com.test;
import com.google.common.base.Splitter;
import com.google.common.base.Splitter.MapSplitter;

public class SysplanLibraryTest {

	public static void main(String[] args) {
		String sysplanJobResponseResultMockData = "name=13FebPlan.sysplan,description=System plan created from alpfp104,source=HMC V8R8.7.0.3.5,version=HMC 2.0,date=13-feb-2020 14.11.11";
//		SysplanLibraryBean uiBean = new SysplanLibraryBean();
//		try {
//			List<SysplanUIBean> uiBeanParse = uiBean.processResult(sysplanJobResponseResultMockData);
			 Splitter resultSplitter = Splitter.onPattern("\\r\\n|\\n|\\r").omitEmptyStrings().trimResults();
		     MapSplitter dataSplitter = Splitter.onPattern(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)").withKeyValueSeparator(Splitter.on('='));
		     Iterable<String> resultTokens = resultSplitter.split(sysplanJobResponseResultMockData);
		     for (String resultLine : resultTokens) {
		    	 System.out.println(resultLine);
		     }

		
	}

}

