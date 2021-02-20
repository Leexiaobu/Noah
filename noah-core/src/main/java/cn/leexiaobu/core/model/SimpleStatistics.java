package cn.leexiaobu.core.model;


public class SimpleStatistics extends BaseStatistics implements java.io.Serializable {

  public Long begin;
  public Long end;
  public Long useTime;
  public String errorMsg;
  public String errorType;
  public String serviceName; //服务名称
  public String simpleName; //服务简称
  public String methodName; //方法名称

  public Long getBegin() {
    return begin;
  }

  public void setBegin(Long begin) {
    this.begin = begin;
  }

  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }


  public Long getUseTime() {
    return useTime;
  }

  public void setUseTime(Long useTime) {
    this.useTime = useTime;
  }

  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

  public String getErrorType() {
    return errorType;
  }

  @Override
  public String toString() {
    return super.toString() + "SimpleStatistics{" +
        "begin=" + begin +
        ", end=" + end +
        ", useTime=" + useTime +
        ", errorMsg='" + errorMsg + '\'' +
        ", errorType='" + errorType + '\'' +
        ", serviceName='" + serviceName + '\'' +
        ", simpleName='" + simpleName + '\'' +
        ", methodName='" + methodName + '\'' +
        '}';
  }

  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getSimpleName() {
    return simpleName;
  }

  public void setSimpleName(String simpleName) {
    this.simpleName = simpleName;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public SimpleStatistics() {
    super();
    this.setBegin(System.currentTimeMillis());
  }
}