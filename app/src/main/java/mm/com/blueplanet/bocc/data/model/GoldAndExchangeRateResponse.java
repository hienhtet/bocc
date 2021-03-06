package mm.com.blueplanet.bocc.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by smmon on 5/23/17.
 */

public class GoldAndExchangeRateResponse {
    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<GoldAndExchangeRate> results;

    @SerializedName("total_result")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;


    public int getPage() {
        return page;
    }

    public List<GoldAndExchangeRate> getResults() {
        return results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setResults(List<GoldAndExchangeRate> results) {
        this.results = results;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
