package com.politicalforum.beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Group {

	private String groupId;
	private String groupName;
	private String groupDescription;
	private String groupOwnerId;
	private Date groupCreationTime;
	private List<GroupDiscussion> groupDiscussions = new ArrayList<>(); 
	private GroupDiscussion selectedGroupDiscussion;
	private String groupFollowersId;
	private List<Project> projects = new ArrayList<>();
	private List<Poll> polls = new ArrayList<>();
	private Poll selectedPoll;
	private Project selectedProject;
	
	public Group() {
	}

	public Group(String groupName) {
		super();
		this.groupName = groupName;
	}
	
	public Group(String groupId, String groupName, String groupDescription, String groupOwnerId, Date groupCreationTime) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.groupOwnerId = groupOwnerId;
		this.groupCreationTime = groupCreationTime;
	}
	
	public Group(String groupId, String groupName, String groupDescription, String groupOwnerId, Date groupCreationTime, String groupFollowersId) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.groupOwnerId = groupOwnerId;
		this.groupCreationTime = groupCreationTime;
		this.groupFollowersId = groupFollowersId;
	}

	public Group(String groupName, String groupDescription, String groupOwnerId, Date groupCreationTime) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.groupOwnerId = groupOwnerId;
		this.groupCreationTime = groupCreationTime;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getGroupOwnerId() {
		return groupOwnerId;
	}

	public void setGroupOwnerId(String groupOwnerId) {
		this.groupOwnerId = groupOwnerId;
	}

	public Date getGroupCreationTime() {
		return groupCreationTime;
	}

	public void setGroupCreationTime(Date groupCreationTime) {
		this.groupCreationTime = groupCreationTime;
	}

	public String getGroupId() {
		return this.groupId;
	}
	
	public List<GroupDiscussion> getGroupDiscussions() {
		return groupDiscussions;
	}

	public void setGroupDiscussions(List<GroupDiscussion> groupDiscussions) {
		this.groupDiscussions = groupDiscussions;
	}

	public GroupDiscussion getSelectedGroupDiscussion() {
		return selectedGroupDiscussion;
	}

	public void setSelectedGroupDiscussion(GroupDiscussion selectedGroupDiscussion) {
		this.selectedGroupDiscussion = selectedGroupDiscussion;
	}
	
	public String getGroupFollowersId() {
		return groupFollowersId;
	}

	public void setGroupFollowersId(String groupFollowersId) {
		this.groupFollowersId = groupFollowersId;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(Project selectedProject) {
		this.selectedProject = selectedProject;
	}

	public List<Poll> getPolls() {
		return polls;
	}

	public void setPolls(List<Poll> polls) {
		this.polls = polls;
	}

	public Poll getSelectedPoll() {
		return selectedPoll;
	}

	public void setSelectedPoll(Poll selectedPoll) {
		this.selectedPoll = selectedPoll;
	}
	
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", groupDescription=" + groupDescription
				+ ", groupOwnerId=" + groupOwnerId + ", groupCreationTime=" + groupCreationTime + ", groupDiscussions="
				+ groupDiscussions + ", selectedGroupDiscussion=" + selectedGroupDiscussion + ", groupFollowersId="
				+ groupFollowersId + ", projects=" + projects + "]";
	}

}
