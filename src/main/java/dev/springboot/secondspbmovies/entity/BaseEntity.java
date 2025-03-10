package dev.springboot.secondspbmovies.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

//đánh dấu rằng đây là "cha"
@MappedSuperclass 

// Chức năng auditing giúp theo dõi và ghi lại các thay đổi của entity
//@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long base_id;
	
	@Column
//	@CreatedBy
	private String createdBy;
	
	@Column
//	@CreatedDate
	private Date createdDate;
	
	@Column
//	@LastModifiedBy
	private String modifiedBy;
	
	@Column
//	@LastModifiedDate
	private Date modifiedDate;
	
	public Long getBase_id() {
		return base_id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
