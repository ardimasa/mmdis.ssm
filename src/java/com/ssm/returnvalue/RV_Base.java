 
package com.ssm.returnvalue;

import com.ssm.model.dt_company_com;
import java.util.ArrayList;
 
public class RV_Base {
    public ArrayList<dt_company_com> Results;
    public String Message;
    public int Total;
    public boolean Success;
    
    public RV_Base(){
        this.Results = new ArrayList<>();
        this.Success = false;
        this.Total = 0;
    } 
}
