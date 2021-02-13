package DateMerger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class DateMergerTest {

	DateMerger dateMerger = new DateMerger();
	@Test
	void testMergeDates() {

		List<DateRange> dateRanges = new LinkedList<DateRange>();

		dateRanges.add(new DateRange(LocalDate.of(2014, 1, 1), LocalDate.of(2014, 1, 30)));
		dateRanges.add(new DateRange(LocalDate.of(2014, 1, 15), LocalDate.of(2014, 2, 15)));
		dateRanges.add(new DateRange(LocalDate.of(2014, 3, 10), LocalDate.of(2014, 4, 15)));
		dateRanges.add(new DateRange(LocalDate.of(2014, 4, 10), LocalDate.of(2014, 5, 15)));

		
		List<DateRange> mergedDateRanges = dateMerger.mergeDates(dateRanges);
		assertEquals(2, mergedDateRanges.size());
	}

}
