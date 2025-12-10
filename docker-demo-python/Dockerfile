# ===========================
# Stage 1 — Build dependencies
# ===========================
FROM python:3.11-slim AS builder

WORKDIR /app
COPY requirements.txt .
RUN pip install --prefix=/install -r requirements.txt

# ===========================
# Stage 2 — Runtime
# ===========================
FROM python:3.11-slim
WORKDIR /app

# Copy installed packages
COPY --from=builder /install /usr/local

# Copy source code
COPY . .

EXPOSE 5000

CMD ["python", "app.py"]
