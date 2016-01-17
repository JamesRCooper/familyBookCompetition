/*
 * Copyright (C) 2015 by Amobee Inc.
 * All Rights Reserved.
 */
package cooper.dtos;

public class CondensedReader {

    private String nickname;
    private Long pageCount;

    public CondensedReader(String nickname, Long pageCount) {
        this.nickname = nickname;
        this.pageCount = pageCount;
    }

    public String getNickname() {
        return nickname;
    }

    public Long getPageCount() {
        return pageCount;
    }
}
