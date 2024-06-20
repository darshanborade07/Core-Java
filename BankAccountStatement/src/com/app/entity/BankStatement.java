package com.app.entity;

import java.time.LocalDate;

public class BankStatement {

	private LocalDate transactionDate;
	private String narration;
	private double withdrawalAmount;
	private double depositAmount;
	
	public BankStatement(LocalDate transactionDate, String narration, double withdrawalAmount, double depositAmount) {
		super();
		this.transactionDate = transactionDate;
		this.narration = narration;
		this.withdrawalAmount = withdrawalAmount;
		this.depositAmount = depositAmount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	@Override
	public String toString() {
		return "BankStatement [transactionDate=" + transactionDate + ", narration=" + narration + ", withdrawalAmount="
				+ withdrawalAmount + ", depositAmount=" + depositAmount + "]";
	}
	
}
