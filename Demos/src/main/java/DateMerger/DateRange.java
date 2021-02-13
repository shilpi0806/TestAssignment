package DateMerger;

import java.time.LocalDate;

public class DateRange implements Comparable<DateRange> {

	private LocalDate startDate;
	private LocalDate endDate;

	public DateRange(LocalDate startDate, LocalDate endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	@Override
	public int compareTo(DateRange d) {

		if (getStartDate() == null || d.getStartDate() == null) {
			return 0;
		}
		return getStartDate().compareTo(d.getStartDate());
	}

}
