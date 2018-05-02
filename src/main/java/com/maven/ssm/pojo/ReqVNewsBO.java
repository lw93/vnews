package com.maven.ssm.pojo;

/**
 * @Project: vnews
 * @Class: ReqVnewsBO.java
 * @Description: bo
 * @Date: 2018年4月1日
 * @author liuwei5
 */
public class ReqVNewsBO {
	private String project;
	private String vnewsType;
    private int pageNum;
    private int size;
	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}
	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}
	/**
	 * @return the vnewsType
	 */
	public String getVnewsType() {
		return vnewsType;
	}
	/**
	 * @param vnewsType the vnewsType to set
	 */
	public void setVnewsType(String vnewsType) {
		this.vnewsType = vnewsType;
	}
	/**
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}
	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReqVNewsBO [project=" + project + ", vnewsType=" + vnewsType
				+ ", pageNum=" + pageNum + ", size=" + size + "]";
	}

}
