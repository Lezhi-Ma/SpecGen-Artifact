import java.util.*;

public class HttpServletRequest {

  private Cookie cookie = null;
  private String tainted = null;

  public void setTaintedValue(String value) {
    tainted = value;
    this.cookie = new Cookie(tainted, tainted);
  }

  public String[] getParameterValues(String name) {
    return new String[] {tainted};
  }

  public String getAuthType() {
    return tainted;
  }

  public Cookie[] getCookies() {
    return new Cookie[] {cookie};
  }

  public String getHeader(String string) {
    return tainted;
  }

  public Enumeration getHeaders(String string) {
    return Collections.enumeration(Collections.singleton(tainted));
  }

  public Enumeration getHeaderNames() {
    return Collections.enumeration(Collections.singleton(tainted));
  }

  public String getQueryString() {
    return tainted;
  }

  public String getRemoteUser() {
    return tainted;
  }

  public StringBuffer getRequestURL() {
    return new StringBuffer(tainted);
  }

  public String getParameter(String string) {
    return tainted;
  }

  public Enumeration getParameterNames() {
    return Collections.enumeration(Collections.singleton("name"));
  }

  public Map getParameterMap() {
    Map<String, String> map = new HashMap<>();
    map.put("name", tainted);
    return map;
  }

  public String getProtocol() {
    return tainted;
  }

  public String getScheme() {
    return tainted;
  }
}
