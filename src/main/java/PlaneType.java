public enum PlaneType {
    BOEING747(10, 20),
    AIRBUSA380(7, 27);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
