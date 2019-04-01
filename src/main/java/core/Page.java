package core;

import static core.BaseConfig.BASE_CONFIG;

/**
 * The interface Page.
 */
public interface Page {

    /**
     * Navigate to page.
     *
     * @return the page
     */
    default Page navigateTo() {
        return navigateTo(url());
    }

    /**
     * Navigate to page.
     *
     * @param url the url
     * @return the page
     */
    Page navigateTo(String url);

    /**
     * Url string.
     *
     * @return the string
     */
    default String url() {
        return BASE_CONFIG.url();
    }
}
