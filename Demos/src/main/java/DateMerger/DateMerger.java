package DateMerger;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DateMerger {

	public List<DateRange> mergeDates(List<DateRange> dateRanges) {
		Collections.sort(dateRanges);
		List<DateRange> mergedDateRanges = new LinkedList<DateRange>();
		DateRange currentDateRange = new DateRange(dateRanges.get(0).getStartDate(), dateRanges.get(0).getEndDate());

		for (int i = 1;i < dateRanges.size(); i++) {

			if (currentDateRange.getEndDate().isBefore(dateRanges.get(i).getStartDate())) {
				mergedDateRanges.add(currentDateRange);
				currentDateRange = new DateRange(dateRanges.get(i).getStartDate(), dateRanges.get(i).getEndDate());
			} else {
				currentDateRange.setEndDate(dateRanges.get(i).getEndDate());
			}

		}

		mergedDateRanges.add(currentDateRange);
		return mergedDateRanges;
	}
}
