/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author janhavi
 */
public class CovidCareWorkRequest extends WorkRequest{
    
    private Date appointmentDate;
    private Boolean isHealthy;
    private Boolean isCovidVaccinated;

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Boolean getIsHealthy() {
        return isHealthy;
    }

    public void setIsHealthy(Boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public Boolean getIsCovidVaccinated() {
        return isCovidVaccinated;
    }

    public void setIsCovidVaccinated(Boolean isCovidVaccinated) {
        this.isCovidVaccinated = isCovidVaccinated;
    }
    
}
