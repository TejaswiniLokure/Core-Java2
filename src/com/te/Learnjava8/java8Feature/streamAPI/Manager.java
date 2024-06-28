package com.te.Learnjava8.java8Feature.streamAPI;

import java.time.LocalDate;
import java.util.Objects;

public class Manager {
	private int mId;
	private String mName;
	private int mAge;
	private String mDept;
	private double mSalary;

	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", mName=" + mName + ", mAge=" + mAge + ", mDept=" + mDept + ", mSalary="
				+ mSalary + ", mDateOfJoining=" + mDateOfJoining + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mAge, mDateOfJoining, mDept, mId, mName, mSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return mAge == other.mAge && Objects.equals(mDateOfJoining, other.mDateOfJoining)
				&& Objects.equals(mDept, other.mDept) && mId == other.mId && Objects.equals(mName, other.mName)
				&& Double.doubleToLongBits(mSalary) == Double.doubleToLongBits(other.mSalary);
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmAge() {
		return mAge;
	}

	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	public String getmDept() {
		return mDept;
	}

	public void setmDept(String mDept) {
		this.mDept = mDept;
	}

	public double getmSalary() {
		return mSalary;
	}

	public void setmSalary(double mSalary) {
		this.mSalary = mSalary;
	}

	public LocalDate getmDateOfJoining() {
		return mDateOfJoining;
	}

	public void setmDateOfJoining(LocalDate mDateOfJoining) {
		this.mDateOfJoining = mDateOfJoining;
	}

	public Manager(int mId, String mName, int mAge, String mDept, double mSalary, LocalDate mDateOfJoining) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mAge = mAge;
		this.mDept = mDept;
		this.mSalary = mSalary;
		this.mDateOfJoining = mDateOfJoining;
	}

	LocalDate mDateOfJoining;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

}
