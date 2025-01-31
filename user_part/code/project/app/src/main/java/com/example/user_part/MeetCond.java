package com.example.user_part;

public class MeetCond {
    private String hotelName; //호텔 이름
    private int priceOfDay; //1박 당 가격
    private float grade;    //평점
    private String review;  //리뷰
    private int picture;   //사진
    private String iTime;  //체크인 시간
    private String oTime;  //체크아웃 시간
    private String exFacility; //부대시설
    private String location; //위치
    private String roomType; //방 타입
    private boolean meal;   //식사
    private int mealPrice;   //식사가격

    public String getiTime() {
        return iTime;
    }

    public void setiTime(String iTime) {
        this.iTime = iTime;
    }

    public int getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(int mealPrice) {
        this.mealPrice = mealPrice;
    }

    private int maxHeadCnt; //최대 인수

    public MeetCond(String hotelName,
                    int priceOfDay,
                    float grade,
                    int picture,
                    String iTime,
                    String oTime,
                    String exFacility,
                    String location,
                    String roomType,
                    boolean meal,
                    int mealPrice,
                    int maxHeadCnt) {
        this.hotelName = hotelName;
        this.priceOfDay = priceOfDay;
        this.grade = grade;
        this.picture = picture;
        this.iTime = iTime;
        this.oTime = oTime;
        this.roomType = roomType;
        this.location = location;
        this.exFacility = exFacility;
        this.meal = meal;
        this.mealPrice = mealPrice;
        this.maxHeadCnt = maxHeadCnt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getPriceOfDay() {
        return priceOfDay;
    }

    public void setPriceOfDay(int priceOfDay) {
        this.priceOfDay = priceOfDay;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getITime() {
        return iTime;
    }

    public void setITime(String ioTime) {
        this.iTime = iTime;
    }

    public String getoTime() {
        return oTime;
    }

    public void setoTime(String ioTime) {
        this.oTime = oTime;
    }

    public String getExFacility() {
        return exFacility;
    }

    public void setExFacility(String exFacility) {
        this.exFacility = exFacility;
    }

    public boolean isMeal() {
        return meal;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }

    public int getMaxHeadCnt() {
        return maxHeadCnt;
    }

    public void setMaxHeadCnt(int maxHeadCnt) {
        this.maxHeadCnt = maxHeadCnt;
    }
}

