package Clock;

public class ClockS {
    int second;

    public ClockS() {
        second = 0;
    }

    public void setTime(int h, int m, int s) {
        // Chuyển đổi h, m, s thành giây và lưu vào seconds
        if (h < 0 || h >= 24 || m < 0 || m >= 60 || s < 0 || s >= 60) {
            throw new IllegalArgumentException("Giá trị giờ, phút, giây không hợp lệ.");
        }
        this.second = h * 3600 + m * 60 + s;
    }

    public int getHours() {
        return second / 3600;
    }

    public int getMinutes() {
        return second % 3600 / 60;
    }

    public int getSeconds() {
        return second % 3600 % 60 % 60;
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }

    public int totalSeconds() {
        return getHours() * 3600 + getMinutes() * 60 + getSeconds();
    }

    public void addSeconds(int s) {
        if (s > 0) second += s;
        else System.out.println("So giay khong hop le!");
    }
}

