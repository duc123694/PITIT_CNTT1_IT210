Mô tả luồng dữ liệu (Data Flow)
View A (Danh sách): Người dùng nhấn vào nút "Chỉnh sửa". Trình duyệt gửi yêu cầu GET kèm ID (ví dụ: /bai3/edit/1).

Controller (Nhận diện): @PathVariable sẽ trích xuất ID từ URL.

Service (Truy vấn): Controller gọi AdminDishService để tìm đối tượng Dish theo ID.

Xử lý Logic (Bẫy dữ liệu):

Nếu tìm thấy: Đẩy đối tượng Dish vào Model và trả về View B (edit-dish.html).

Nếu không thấy: Sử dụng RedirectAttributes để gửi thông báo lỗi và điều hướng (redirect) quay lại trang danh sách.

View B (Hiệu chỉnh): Thymeleaf sử dụng th:object để "bọc" lấy đối tượng và th:field để tự động điền (populate) dữ liệu vào các ô input.

Các biểu thức Thymeleaf sử dụng
@{...}: Link URL expression để tạo đường dẫn động.

th:object="${dish}": Xác định đối tượng đích cho toàn bộ form.

th:field="*{name}": Liên kết thuộc tính name của đối tượng vào input (tương đương với việc set id, name và value thủ công).

@{|/bai3/edit/${dish.id}|}: Literal substitution giúp viết đường dẫn chứa biến sạch sẽ hơn.