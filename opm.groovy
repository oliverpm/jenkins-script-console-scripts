Jenkins.instance.getAllItems(Job).each(){
  	job -> job.isBuildable()   	
  	def myBuild= job.getLastBuild()
    
    if(job.isBuildable()){
  	    def last_job_duration = job.getLastBuild()?.getDurationString()
	    println " JOB " + job.name + " ---------------- Last Build Duración --> " + last_job_duration
        job.job.getUrl()
    }
}
 	/*def lastSuccessfulBuild = myBuild.getPreviousSuccessfulBuild()*/
    //def xxx = myBuild.getPreviousSuccessfulBuild().getDurationString()
  	//def yyy = lastSuccessfulBuild.getRawBuild().getTime()
    //println job.name + " Duración --> " + last_job_duration  
-----------------------------------------------------------------------------------------------------------

def n=0
def num_notnull=0
def miliseconds_alljobs=0

Jenkins.instance.getAllItems(Job).each(){
  job -> job.isBuildable()   	
  def myBuild= job.getLastBuild()
  n = n + 1
    
  def last_job_duration = job.getLastBuild()?.getDurationString()
  def last_job_duration_miliseconds = job.getLastBuild()?.getDuration()
  println n + ".)" + "JOB " + job.getUrl() + " --------> " + last_job_duration + "; MilSeconds:" + last_job_duration_miliseconds
  
  if(last_job_duration!=null){
    num_notnull = num_notnull + 1
    miliseconds_alljobs = miliseconds_alljobs + last_job_duration_miliseconds
  }
  	     
}
println "num_notnull = " + num_notnull + "; null = " + (n-num_notnull)
println "miliseconds_alljobs = " + miliseconds_alljobs
println "seconds_alljobs = " + (miliseconds_alljobs/1000)
println "seconds_average_alljobs = " + (miliseconds_alljobs/1000)/num_notnull
println "minutes_average_alljobs = " + ((miliseconds_alljobs/1000)/num_notnull)/60
println "hours_average_alljobs = " + (((miliseconds_alljobs/1000)/num_notnull)/60)/60
-----------------------------------------------------------------------------------------------------


def n=0
def num_notnull=0
def milliseconds_alljobs=0

Jenkins.instance.getAllItems(Job).each(){
  job -> job.isBuildable()   	
  def myBuild= job.getLastBuild()
  n = n + 1
    
  def last_job_duration = job.getLastBuild()?.getDurationString()
  def last_job_duration_milliseconds = job.getLastBuild()?.getDuration()
  
  println n + ".)" + "JOB " + job.getUrl() + " --------> " + last_job_duration + "; MilliSeconds:" + last_job_duration_milliseconds
  
  if(last_job_duration!=null){
    
    num_notnull = num_notnull + 1
    milliseconds_alljobs = milliseconds_alljobs + last_job_duration_milliseconds
    
    println "Execution Date: " + myBuild.getTime()
    
    if(myBuild.getTime().format( 'yyyyMMdd') >= '20230501'){
      
    }
    
  }
  	     
}

return null
-----------------------------------------------------------------------------------------------
def n=0
def num_notnull=0
def milliseconds_alljobs=0

def num_execution_from_may2023=0
def milliseconds_alljobsfrom_may2023=0

Jenkins.instance.getAllItems(Job).each(){
  job -> job.isBuildable()   	
  def myBuild= job.getLastBuild()
  n = n + 1
    
  def last_job_duration = job.getLastBuild()?.getDurationString()
  def last_job_duration_milliseconds = job.getLastBuild()?.getDuration()
  
  println n + ".)" + "JOB " + job.getUrl() + " --------> " + last_job_duration + "; MilliSeconds:" + last_job_duration_milliseconds
  
  if(last_job_duration!=null){
    
    num_notnull = num_notnull + 1
    milliseconds_alljobs = milliseconds_alljobs + last_job_duration_milliseconds
    
    println "Execution Date: " + myBuild.getTime()
    
    //Contamos las ejecuciones en desde 01/05/2023
    if(myBuild.getTime().format( 'yyyyMMdd') >= '20230501'){
      num_execution_from_may2023 = num_execution_from_may2023 + 1
      milliseconds_alljobsfrom_may2023 = milliseconds_alljobsfrom_may2023 + last_job_duration_milliseconds
    }
    
  }
  	     
}
println "num_notnull = " + num_notnull + "; null = " + (n-num_notnull)
println "milliseconds_alljobs = " + milliseconds_alljobs
println "seconds_alljobs = " + (milliseconds_alljobs/1000)
println "seconds_average_alljobs = " + (milliseconds_alljobs/1000)/num_notnull
println "minutes_average_alljobs = " + ((milliseconds_alljobs/1000)/num_notnull)/60
println "hours_average_alljobs = " + (((milliseconds_alljobs/1000)/num_notnull)/60)/60
println "============================================================================================="
println "hours_alljobs = " + ((milliseconds_alljobs/1000)/60)/60
println "============================================================================================="
println "num_execution_last_execution_from_may2023 = " + num_execution_from_may2023
println "num_execution_total_execution_from_may2023 = " + num_execution_from_may2023*2.5
println "hours_alljobsfrom_may2023 = " + ((milliseconds_alljobsfrom_may2023/1000)/3600)
println "hours_average_alljobsfrom_may2023 = " + ((milliseconds_alljobsfrom_may2023/1000)/3600)/num_execution_from_may2023
println "horas promedio requeridas x 3 mes = " + ((((milliseconds_alljobsfrom_may2023/1000)/3600)/num_execution_from_may2023) * num_execution_from_may2023*2.5)



return null