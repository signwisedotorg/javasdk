/*
Copyright 2016 SignWise Corporation Ltd.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package ee.signwise.sdk.model;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * PDF Signature error info returned by SignWise services
 */
public class PdfSignatureErrorInfo {
	private String m_code;
	private String m_description;
	
	/**
	 * Constructor for PdfSignatureErrorInfo
	 * @param code error code
	 * @param description error message
	*/
	public PdfSignatureErrorInfo(String code, String description)
	{
		m_code = code;
		m_description = description;
	}
	
	/**
	 * Constructor for PdfSignatureErrorInfo
	 * @param jobj JSON object
	 */
	public PdfSignatureErrorInfo(JSONObject jobj)
	{
		m_code = jobj.getString("code");
		m_description = jobj.getString("description");
	}
	
	/**
	 * Returns error code
	 * @return error code
	 */
	public String getCode() 
	{ 
		return m_code; 
	}
	
	/**
	 * Returns error message
	 * @return error message
	 */
	public String getDescription() 
	{ 
		return m_description; 
	}
	
	/**
	 * Returns JSON form for transmission
	 * @return objects JSON form
	 */
	public JSONObject toJSON()
	{
		JSONObject jobj = new JSONObject();
		jobj.putOpt("code", m_code);
		jobj.putOpt("description", m_description);
		return jobj;
	}

	/**
	 * Returns stringified form for info
	 * @return objects stringified form
	 */
	public String toString()
	{
		return toJSON().toString();
	}
}

